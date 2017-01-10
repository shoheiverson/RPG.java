
public class Hero {
	String name;
	int hp;
	final int maxHP=150;
	int out=10;
	int level=1;
	static int money=0;
	
	Sword sword;
	
	static void attack(Hero h,Monster m){
		System.out.println(h.name+"は攻撃した");
		m.hp-=15;
		System.out.println(h.name+h.hp+m.name+m.hp);
	}
	static void run(Hero h){
		int fortune=new java.util.Random().nextInt(5)+1;
		switch(fortune){
		case 1:
		case 2:
		case 3:
		System.out.println(h.name+"は逃げた");
		 h.out-=10;
		 break;
		case 4:
		case 5:
			System.out.println(h.name+"逃げ切れなかった");
		
		}
		
	}
	
	
	
	static void defense(Hero h){
		System.out.println(h.name+"は防御体制に入った");
		h.hp+=50;
	}
	




Hero(){
	this.hp=100;
	
}
}

