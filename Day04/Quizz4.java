import java.util.Random;
import java.util.Scanner;

// �ֻ����� �ΰ� ������ ����
// �� �ֻ����� ���� 7�� �Ǹ� ���ε���
// ���ε��� ���� ��� �������� ������ ���� ���ε� Ż��
// ���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
// ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�
// ���ε��� ���дٴ� ������ �߸��� ���ٹ��Դϴ�. (?)

public class Quizz4 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int island = 0;			// ���ε��� 1 , ���ε� �ƴϸ� 0
		int count = 3;			// ���ε� Ż�� ī��Ʈ
		int condition = 0;		// ������ �Գ� ?
		int conditionMax = 100;	// ������ ���� ?
		int conditionRemain = conditionMax - condition; 
								// �󸶳� ���ҳ� ?
		int gameTry = 0;		// �󸶳� �õ��ߴ� ?
		int gameMu = 0;			// �󸶳� ���ε� �ٳ�Դ� ?
		
		
		for ( ; ; ) {
			System.out.printf("############################################\n");
			System.out.printf("##----------------------------------------##\n");
			System.out.printf("##1. �ֻ��� ������         0.����         ##\n");
			System.out.printf("##----------------------------------------##\n");
			System.out.printf("############################################\n");
			System.out.printf("#�����ϼ��� :");

			int no = sc.nextInt();
			if ( no == 1 ) {
				int first = random.nextInt(6) + 1;
				int second = random.nextInt(6) + 1;
				gameTry = gameTry + 1;

				if ( island == 0 ) {  // ���ε��� �ƴմϴ�.
					if ( ( first + second ) == 7 ) {
						count = 3;
						island = island + 1;
						gameMu = gameMu + 1;
						System.out.printf("#############################################\n");
						System.out.printf("#ù��������:%2d,     �ι��� ����:%2d        #\n",first,second);
						System.out.printf("#            ��.��.��.                      #\n");
						System.out.printf("#                           ����� ��ġ %2d #\n",condition);
						System.out.printf("#                           ���� ĭ %2d     #\n",conditionRemain);
					} else {
						condition = condition + ( first + second );
						conditionRemain = conditionMax - condition;
						System.out.printf("#############################################\n");
						System.out.printf("#  ù��������: %2d,   �ι��� ����: %2d       #\n",first,second);
						System.out.printf("#  %2d ĭ��ŭ����                           #\n",first + second);
						System.out.printf("#                           ����� ��ġ %2d #\n",condition);
						System.out.printf("#                           ���� ĭ %2d     #\n",conditionRemain);

							if ( condition >= conditionMax ) {
							System.out.printf("##########################################################\n");
							System.out.printf("#                 ����� ���� ��!!                       #\n");
							System.out.printf("# ����� ��ġ : %2d    || �� ������ �� : %2d             #\n",condition,conditionMax);
							System.out.printf("# ����� �õ�ȸ�� : %2d || ���ε��� �ٳ��ȸ�� : %2d     #\n",gameTry,gameMu);
							System.out.printf("##########################################################\n");	
							break;
							}
					}
				}  else {  // ���ε� �Դϴ�.
					if ( first == second ) {
						island = island - 1;
						System.out.printf("############################################\n");
						System.out.printf("# ù��������:%2d,  �ι��� ����:%2d         #\n",first,second);
						System.out.printf("#           ��.��.��.Ż.��.  (����)        #\n");
						System.out.printf("#                          ����� ��ġ %2d #\n",condition);
						System.out.printf("#                          ���� ĭ %2d     #\n",conditionRemain);
					}	else  {
							if ( count == 1 ) {
						island = island - 1;
						System.out.printf("############################################\n");
						System.out.printf("# ù��������:%2d,  �ι��� ����:%2d         #\n",first,second);
						System.out.printf("#           ��.��.��.Ż.��.  (3ȸ ����)    #\n");
						System.out.printf("#                          ����� ��ġ %2d #\n",condition);
						System.out.printf("#                          ���� ĭ %2d     #\n",conditionRemain);
								count = 3;
							} else {
						count = count - 1;
						System.out.printf("##############################################\n");
						System.out.printf("# ù��������:%2d, �ι��� ����:%2d ==>Ż��Ұ�#\n",first,second);
						System.out.printf("# �ٸ����� 3���̸� Ż�� ==> ���� %2d ȸ      #\n",count);
						System.out.printf("#                           ����� ��ġ %2d  #\n",condition);
						System.out.printf("#                           ���� ĭ %2d      #\n",conditionRemain);
							}
					}
				}
			}	else  {
				System.out.printf("���α׷��� �����մϴ�.\n");
				break;
			}
		}
	}
}