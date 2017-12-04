/*
 * Automatically generated by jrpcgen 1.1.1 on 12/1/15 11:39 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package client.nfs;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class renameargs implements XdrAble {
    public diropargs from;
    public diropargs to;

    public renameargs() {
    }

    public renameargs(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        from.xdrEncode(xdr);
        to.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        from = new diropargs(xdr);
        to = new diropargs(xdr);
    }

}
// End of renameargs.java
