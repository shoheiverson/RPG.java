
public class Monster {
	
	String name;
	int hp;
	int out=10;
	int ap=10;
	
	
	static void attack(Hero h,Monster m){
		System.out.println(m.name+"は攻撃した");
		h.hp-=m.ap;
		
	}
	
	static void run(Monster m){
		System.out.println(m.name+"は逃げた");
		m.out-=10;
	}
	
	
	
	static void sleep(Monster m){
		m.hp=m.hp+=10;
		System.out.println(m.name+"はHPは10回復した。");
	}
	
	Monster(){
		this.hp=50;
		
	}

	

}
