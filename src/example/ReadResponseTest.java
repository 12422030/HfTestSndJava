package example;

import java.util.List;

import cfca.safeguard.api.mps.ClientEnvironment;
import cfca.safeguard.api.mps.SGBusiness;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200102;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200104;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200106;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200202;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200204;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200206;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200302;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200304;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200306;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200308;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200310;
import cfca.safeguard.api.mps.bean.tx.downstream.Tx200401;
import cfca.safeguard.tx.TxBase;

/**
 * @Author lvyong
 * @Description 
 * @CodeReviewer daimin
 */
public class ReadResponseTest {
    public static void main(String[] args) throws Exception {
        ClientEnvironment.initClientEnvironment("config");
        SGBusiness sgBusiness = new SGBusiness();
        
        List<TxBase> txList = sgBusiness.readAllInDownstreamDirectory();
        for (TxBase tx : txList){
            String txCode = tx.getTxCode();
            if ("200102".equals(txCode)) {
                Tx200102 tx2 = (Tx200102) tx;
                System.out.println(tx2.getFilePath());
                System.out.println(tx2.getFeedbackRemark());
                sgBusiness.deleteDownstreamFileByTx(tx2);
            } else if ("200104".equals(txCode)) {
                Tx200104 tx2 = (Tx200104) tx;
                System.out.println(tx2.getFilePath());
                System.out.println(tx2.getCardNumber());
            } else if ("200106".equals(txCode)) {
                Tx200106 tx2 = (Tx200106) tx;
                System.out.println(tx2.getAccountBalance());
            } else if ("200202".equals(txCode)) {
                Tx200202 tx2 = (Tx200202) tx;
                System.out.println(tx2.getFormerFrozenBalance());
            } else if ("200204".equals(txCode)) {
                Tx200204 tx2 = (Tx200204) tx;
                System.out.println(tx2.getOperatorName());
            } else if ("200206".equals(txCode)) {
                Tx200206 tx2 = (Tx200206) tx;
                System.out.println(tx2.getFeedbackOrgName());
            } else if ("200302".equals(txCode)) {
                Tx200302 tx2 = (Tx200302) tx;
                System.out.println(tx2.getFeedbackRemark());
            } else if ("200304".equals(txCode)) {
                Tx200304 tx2 = (Tx200304) tx;
                System.out.println(tx2.getStateTaxSerial());
            } else if ("200306".equals(txCode)) {
                Tx200306 tx2 = (Tx200306) tx;
                System.out.println(tx2.getCardNumber());
            } else if ("200308".equals(txCode)) {
                Tx200308 tx2 = (Tx200308) tx;
                System.out.println(tx2.getBankID());
            } else if ("200310".equals(txCode)) {
                Tx200310 tx2 = (Tx200310) tx;
                System.out.println(tx2.getOperatorName());
            } else if ("200401".equals(txCode)) {
                Tx200401 tx2 = (Tx200401) tx;
                System.out.println(tx2.getOperatorName());
            }
        }
    }
}
