import java.io.*;
import java.util.*;
public class MEITUAN {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
int[] ans = new int[5];

        for (int k = 0; k < 5; k++) {


           String sa = reader.readLine();
            System.out.println(sa);
            int max = 0;
            for(int i=0;i<sa.length();i++){
                max=Math.max(max, sa.charAt(i)-'0');
            }
            ans[k]=max;
        }
        for(int i:ans) System.out.println(i);
    }
}

/*
D:\environment\JAVA\bin\java.exe "-javaagent:D:\IntelliJ IDEA 2020.3\lib\idea_rt.jar=57406:D:\IntelliJ IDEA 2020.3\bin" -Dfile.encoding=UTF-8 -classpath D:\environment\JAVA\jre\lib\charsets.jar;D:\environment\JAVA\jre\lib\deploy.jar;D:\environment\JAVA\jre\lib\ext\access-bridge-64.jar;D:\environment\JAVA\jre\lib\ext\cldrdata.jar;D:\environment\JAVA\jre\lib\ext\dnsns.jar;D:\environment\JAVA\jre\lib\ext\jaccess.jar;D:\environment\JAVA\jre\lib\ext\jfxrt.jar;D:\environment\JAVA\jre\lib\ext\localedata.jar;D:\environment\JAVA\jre\lib\ext\nashorn.jar;D:\environment\JAVA\jre\lib\ext\sunec.jar;D:\environment\JAVA\jre\lib\ext\sunjce_provider.jar;D:\environment\JAVA\jre\lib\ext\sunmscapi.jar;D:\environment\JAVA\jre\lib\ext\sunpkcs11.jar;D:\environment\JAVA\jre\lib\ext\zipfs.jar;D:\environment\JAVA\jre\lib\javaws.jar;D:\environment\JAVA\jre\lib\jce.jar;D:\environment\JAVA\jre\lib\jfr.jar;D:\environment\JAVA\jre\lib\jfxswt.jar;D:\environment\JAVA\jre\lib\jsse.jar;D:\environment\JAVA\jre\lib\management-agent.jar;D:\environment\JAVA\jre\lib\plugin.jar;D:\environment\JAVA\jre\lib\resources.jar;D:\environment\JAVA\jre\lib\rt.jar;D:\JavaProject\classLoder\target\classes;D:\maven-repo\org\springframework\spring-webmvc\5.1.9.RELEASE\spring-webmvc-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-aop\5.1.9.RELEASE\spring-aop-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-beans\5.1.9.RELEASE\spring-beans-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-context\5.1.9.RELEASE\spring-context-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-core\5.1.9.RELEASE\spring-core-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-jcl\5.1.9.RELEASE\spring-jcl-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-expression\5.1.9.RELEASE\spring-expression-5.1.9.RELEASE.jar;D:\maven-repo\org\springframework\spring-web\5.1.9.RELEASE\spring-web-5.1.9.RELEASE.jar;D:\maven-repo\cglib\cglib\3.3.0\cglib-3.3.0.jar;D:\maven-repo\org\ow2\asm\asm\7.1\asm-7.1.jar MEITUAN
6 4
2 3 1 2 3 3
1 7 5
2
3

3
4
1111010
0030020
3451659
1419418
89481423
 */

