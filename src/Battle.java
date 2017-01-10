
public class Battle {
	
	
	public static void battle(Hero h,Monster m) {
		
		if(h.level<4){
		while(h.hp>0&&m.hp>0&&m.out==10&&h.out==10){
			System.out.println(h.name+h.hp+m.name+m.hp);
			System.out.println("");
			System.out.println("1.戦う 2.防御する 3.逃げる");
			int ac=new java.util.Scanner(System.in).nextInt();
			switch(ac){
			case 1:
				Hero.attack(h,m);
				break;
			case 2:
				Hero.defense(h);
				break;
			case 3:
				Hero.run(h);
				
			}
			System.out.println("");
			if(h.out<=0){
				
			}
			else if(m.hp<=0){
				System.out.println(m.name+"を倒した");
			}
			else{
			if(m.hp>=15){
				Monster.attack(h,m);
			}
			else{
				int fortune=new java.util.Random().nextInt(5)+1;
			
			switch(fortune){
			
			case 1:
			case 2:
				Monster.attack(h,m);
				break;
			case 3:
			case 4:
				Monster.sleep(m);
				break;
			case 5:
				Monster.run(m);}
			
			}
			}
		
			}
		if(h.out<=0||h.hp<=0){
			h.out=10;
			m.out=10;
			System.out.println(h.name+"は村に帰った");
			Main.action(h, m);
		}
		else{
		h.out=10;
		m.hp=50;
		m.out=10;
		h.level+=1;
		Hero.money+=100;
		System.out.println(h.name+"は次のレベルに挑戦できるようになった");
	
	Main.action(h,m);}
		}
		
		else{
			int turn=1;
			int y=1;
			int z=2;
			int turn3=3;
			while(h.hp>0&&m.hp>0&&m.out==10&&h.out==10){
				
				if(turn>turn3){
					turn3=y+z;
				}
				
				System.out.println(h.name+h.hp+m.name+m.hp);
				System.out.println("");
				System.out.println("1.戦う 2.50回復 3.逃げる");
				int ac=new java.util.Scanner(System.in).nextInt();
				switch(ac){
				case 1:
					Hero.attack(h,m);
					break;
				case 2:
					Hero.defense(h);
					break;
				case 3:
					Hero.run(h);
					
				}
				System.out.println("");
				if(h.out<=0){
					
				}
				else if(m.hp<=0){
					System.out.println(m.name+"を倒した");
				}
				else{
				if(m.hp>=15&&turn!=turn3){
					Monster.attack(h,m);
				}
				else if(turn==turn3){
					System.out.println(m.name+"は攻撃に失敗した");
				}
				else{
					int fortune=new java.util.Random().nextInt(5)+1;
				
				switch(fortune){
				
				case 1:
				case 2:
					Monster.attack(h,m);
					break;
				case 3:
				case 4:
					Monster.sleep(m);
					break;
				case 5:
					Monster.run(m);
					}
				
				}
				}
				if(turn==y+z){
				y=z;
				z=turn3;
				}
				turn+=1;
				}
			
			
			if(h.out<=0||h.hp<=0){
				h.out=10;
				m.out=10;
				System.out.println(h.name+"は村に帰った");
				Main.action(h, m);
			}
			else{
			h.out=10;
			m.hp=50;
			m.out=10;
			h.level+=1;
			Hero.money+=100;
			System.out.println(h.name+"は次のレベルに挑戦できるようになった");
		
		Main.action(h,m);}
		}
		
		
	}
}