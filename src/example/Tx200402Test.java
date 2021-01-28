package example;

import cfca.safeguard.api.mps.ClientEnvironment;
import cfca.safeguard.api.mps.SGBusiness;
import cfca.safeguard.api.mps.bean.tx.upstream.Tx200402;


/**
 * 案件举报反馈
 */
public class Tx200402Test {
    public static void main(String[] args) throws Exception {
        ClientEnvironment.initClientEnvironment("config");
        SGBusiness sgBusiness = new SGBusiness();

        Tx200402 tx200402=new Tx200402();
        String mode = "01";
        String to = "dmbank";
        String transSerialNumber = "dmmps20160325200402";
        
        tx200402.setTransSerialNumber(transSerialNumber);
        tx200402.setApplicationID("10040120160418");
        tx200402.setApplicationType("01");
        tx200402.setReportEndTime("20160411101500");
        tx200402.setResult("0000");
        tx200402.setOperatorName("徐");
        tx200402.setOperatorPhoneNumber("1101010");
        tx200402.setFeedbackOrgName("五局");
        tx200402.setFeedbackRemark("test");

        try {
            sgBusiness.writeUpstreamXml(tx200402, mode, to);
            System.out.println("写入文件成功");
        } catch (Exception e) {
            System.out.println("写入文件失败");
            e.printStackTrace();
        }
    }

}
