/*
 * Automatically generated by jrpcgen 1.1.1 on 11/26/15 9:02 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package client.mount;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class exportlist implements XdrAble {
    public dirpath filesys;
    public groups groups;
    public exportlist next;

    public exportlist() {
    }

    public exportlist(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        filesys.xdrEncode(xdr);
        groups.xdrEncode(xdr);
        next.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        filesys = new dirpath(xdr);
        groups = new groups(xdr);
        next = new exportlist(xdr);
    }

}
// End of exportlist.java
