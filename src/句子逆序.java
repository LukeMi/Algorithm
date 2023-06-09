public class 句子逆序 {
    public static void main(String[] args) {
        String s = "I am a body";
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length -1; i >=0; i--) {
            sb.append(s1[i]);
            sb.append(i !=0 ? " ": "");
        }
        System.out.println(sb.toString());
    }
}
