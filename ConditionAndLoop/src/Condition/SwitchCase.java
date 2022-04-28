package Condition;

public class SwitchCase {
    public static void main(String[] args) {
        //switch-case 조건문 연습

        int countryCode = 82;
        String country = null;

        switch(countryCode) {
            case 1:
                country = "USA 입니다.";
                break;                    //조건 만족시 switch문 탈출
            case 86:
                country = "China 입니다.";
                break;
            case 81:
                country = "Japan 입니다.";
                break;

            case 82:
                country = "Republic of Korea 입니다.";
                break;

            case 44:
                country = "United Kingdom 입니다.";
                break;
                
            default:    //모든 조건을 만족하지 않는 경우
                country = "데이터가 존재하지 않습니다.";
        }
        System.out.println("국가 코드 " + countryCode + "의 국가는 " + country);
    }
}
