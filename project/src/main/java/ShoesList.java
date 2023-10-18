import java.util.Scanner;

public class ShoesList {
    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Scanner sc = new Scanner(System.in);
    String shoesName = "";
    String shoesSize = "";
    String finalSelectShoes = "";
    public String shoesList() {
        while (true) {

            label:
            System.out.println("상품 목록입니다.");

            System.out.println("===========================");
            System.out.println("1. 나이키 인피니티 런");
            System.out.println("2. 캔버스 척테일러");
            System.out.println("3. 스테파노로시 버스");
            System.out.println("4. 아디다스 퍼피랫 ");
            System.out.println("5. 퓨마 바리 뮬 ");

            System.out.print("원하시는 신발을 선택해주세요 : ");

            int selectShoes = sc.nextInt();
            sc.nextLine();
            switch (selectShoes) {
                case (1):
                    System.out.println("나이키 인피니티 런의 사이즈는. ");
                    System.out.println("240, 250, 260 입니다.");
                    System.out.print("사이즈를 선택해주세요 : ");
                    shoesSize += sc.nextLine();
                    shoesName += "나이키 인피니티 런";
                    break;
                case (2):
                    System.out.println("캔버스 척테일러의 사이즈는. ");
                    System.out.println("230, 250, 260 입니다.");
                    System.out.print("사이즈를 선택해주세요 : ");
                    shoesSize += sc.nextLine();
                    shoesName += "캔버스 척테일러";
                    break;
                case (3):
                    System.out.println("스테파노로시 버스의 사이즈는. ");
                    System.out.println("260, 270, 280 입니다.");
                    System.out.print("사이즈를 선택해주세요 : ");
                    shoesSize += sc.nextLine();
                    shoesName += "스테파노로시 버스";
                    break;
                case (4):
                    System.out.println("아디다스 퍼피랫의 사이즈는. ");
                    System.out.println("220, 230, 240 입니다.");
                    System.out.print("사이즈를 선택해주세요 : ");
                    shoesSize += sc.nextLine();
                    shoesName += "아디다스 퍼피랫";
                    break;
                case (5):
                    System.out.println("퓨마 바리 뮬의 사이즈는. ");
                    System.out.println("230, 240, 260 입니다.");
                    System.out.print("사이즈를 선택해주세요 : ");
                    shoesSize += sc.nextLine();
                    shoesName += "퓨마 바리 뮬";
                    break;
            }
            finalSelectShoes = shoesName + " " + shoesSize;
            System.out.println("선택하신 신발은 " + finalSelectShoes + "입니다.");
            System.out.print("장바구니에 담으시려면 1번, 즉시 결제는 2번을 입력해주세요 : ");
            int Y = sc.nextInt();
            sc.nextLine();
            //장바구니 클래스 변수 이름을 shoppingBasket, 장바구니(저장공간)을 shopBasket, 결제를 payment라고 할게요
            if (Y == 1) {
                shoppingBasket.shopBasket(finalSelectShoes); //이건 스트링으로 보내는거)
                break;
            } else if (Y == 2 ) {
                shoppingBasket.peyment(finalSelectShoes);
                break;
            } else {
                System.out.println("초기화면으로 돌아갑니다.");
            }
        }
        return finalSelectShoes;
    }
}

