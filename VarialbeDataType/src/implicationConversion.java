public class implicationConversion {
    public static void main(String[] args) {
        byte bNum = 20;
        int iNum = bNum;    //bNum 자료형이 byte형에서 int형으로 형변환
        float fNum = iNum;  //iNum 자료형이 int형에서 float형으로 형변환
        double dNum = fNum + iNum;  //fNum + iNum의 결과값이 float형에서 double형으로 형변환

        System.out.println(bNum);
        System.out.println(iNum);
        System.out.println(fNum);
        System.out.println(dNum);
    }
}
