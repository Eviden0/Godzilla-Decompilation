/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.eac.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface EACSigner {
    public ASN1ObjectIdentifier getUsageIdentifier();

    public OutputStream getOutputStream();

    public byte[] getSignature();
}

