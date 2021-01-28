package example;

import java.util.ArrayList;
import java.util.List;

import cfca.safeguard.api.mps.ClientEnvironment;
import cfca.safeguard.api.mps.SGBusiness;
import cfca.safeguard.api.mps.bean.tx.upstream.Tx200101;
import cfca.safeguard.tx.Attachment;

/**
 * 止付
 */
public class Tx200101Test {
    public static void main(String[] args) throws Exception {
        ClientEnvironment.initClientEnvironment("config");
        SGBusiness sgBusiness = new SGBusiness();

        Tx200101 tx200101 = new Tx200101();
        String mode = "01";
        String to = "313234001089";
        String fromTGOrganizationId = "";
        String transSerialNumber = "cfcapolice01_0000000000000100002018050446303412075201";

        tx200101.setTransSerialNumber(transSerialNumber);
        tx200101.setApplicationID("200101201805042001010201");
        tx200101.setApplicationType("01");
        tx200101.setOriginalApplicationID("1321321");
        tx200101.setCaseNumber("AJ130100201601019999");
        tx200101.setCaseType("01");
        tx200101.setEmergencyLevel("01");
        tx200101.setTransferOutBankID("002");
        tx200101.setTransferOutBankName("朝阳银行");
        tx200101.setTransferOutAccountName("可以啊");
        tx200101.setTransferOutAccountNumber("6230300111005357024");
        tx200101.setCurrency("RMB");
        tx200101.setTransferAmount("10000");
        tx200101.setTransferTime("20190222000000");
        tx200101.setBankID("002");
        tx200101.setBankName("朝阳银行");
        tx200101.setAccountType("01");
        tx200101.setAccountName("可以啊");
        tx200101.setAccountNumber("6230300111005357024");
        tx200101.setReason("涉嫌诈骗测试");
        tx200101.setRemark("涉嫌诈骗测试");
        tx200101.setStartTime("20210622000000");
        tx200101.setExpireTime("20210624000000");
        tx200101.setApplicationTime("20190222000000");
        tx200101.setApplicationOrgID("010000");
        tx200101.setApplicationOrgName("五局");
        tx200101.setOperatorIDType("01");
        tx200101.setOperatorIDNumber("222303197705328831");
        tx200101.setOperatorName("徐");
        tx200101.setOperatorPhoneNumber("1101010");
        tx200101.setInvestigatorIDType("01");
        tx200101.setInvestigatorIDNumber("123456");
        tx200101.setInvestigatorName("徐");

        List<Attachment> attachmentList = new ArrayList<Attachment>();
        Attachment attachment = new Attachment();
        attachment
                .setContent("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");
        attachment.setFilename("heh.jpg");
        attachmentList.add(attachment);
        tx200101.setAttachments(attachmentList);

        try {
            sgBusiness.writeUpstreamXml(tx200101, fromTGOrganizationId, mode, to);
            System.out.println("写入文件成功");
        } catch (Exception e) {
            System.out.println("写入文件失败");
            e.printStackTrace();
        }
    }
}
