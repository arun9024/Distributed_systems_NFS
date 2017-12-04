/*
 * Automatically generated by jrpcgen 1.1.1 on 12/1/15 11:39 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package client.nfs;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class nfsdata implements XdrAble {

    public byte [] value;

    public nfsdata() {
    }

    public nfsdata(byte [] value) {
        this.value = value;
    }

    public nfsdata(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeDynamicOpaque(value);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        value = xdr.xdrDecodeDynamicOpaque();
    }

}
// End of nfsdata.java
