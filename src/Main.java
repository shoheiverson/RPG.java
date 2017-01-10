

public class Main {
	public static void main(String[] args){
		Sword s=new Sword();
		s.name="剣";
		s.damage=5;
		
		
		
		Hero h = new Hero();
		System.out.println("勇者の名前を決めてください。");
		
		h.name=new java.util.Scanner(System.in).nextLine();
		h.sword=s;

		System.out.println("勇者"+h.name+"をHP"+h.hp+"で生み出しました。");
		
		
		Monster m=new Monster();
	
		m.name="うるふ";
		
		
		Monster m2=new Monster();
		m2.name="ラビット";
		action(h,m);
		
	}
	public static void action(Hero h,Monster m){
		switch(h.level){
		case 1:
			m.hp=50;
			m.name="ラビット";
			m.ap=10;
			break;
		case 2:
			m.hp=70;
			m.name="ウルフ";
			m.ap=15;
			break;
		case 3:
			m.hp=100;
			m.ap=20;
			m.name="ゴーレム";
			break;
		case 4:
			m.name="ボス　ドラゴン";
			m.ap=50;
			m.hp=150;
			break;
		default:
			System.out.println("ゲームクリア");
		}
			System.out.println(h.name+" レベル"+h.level);
			System.out.println("HP"+h.hp+" 所持金"+h.money);
			System.out.println("");
			System.out.println("1.武器屋　2.宿　3.防具屋　4.ダンジョン");
			int tw=new java.util.Scanner(System.in).nextInt();
			switch(tw){
			case 1:
				//武器屋さん
				break;
			case 2:
				Domitory.domitory(h,m);
				//宿
				break;
			case 3:
				//防具屋さん
				break;
			case 4:
				System.out.println("stage"+h.level+1);
				Battle.battle(h, m);
			
			}
			
		}
		
	}

	
