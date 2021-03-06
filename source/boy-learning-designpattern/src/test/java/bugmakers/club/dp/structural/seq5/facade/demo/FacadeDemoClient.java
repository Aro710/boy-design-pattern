package bugmakers.club.dp.structural.seq5.facade.demo;

/**
 * @Description:
 * @Author: Bruce
 * @Datetime: 2018/3/14 18:01
 */
public class FacadeDemoClient {

    private static final String fileNameSrc = "config-repo/structural/seq5/facade/src.txt";
    public static final String fileNameDes = "config-repo/structural/seq5/facade/des.txt";

    /**
     * 程序启动入口
     */
    public static void main(String[] args) {
        DemoEncryptFacade ef = new DemoEncryptFacade();
        ef.fileEncrypt(fileNameSrc, fileNameDes);
    }
}
