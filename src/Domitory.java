
public class Domitory {
	public static void domitory(Hero h,Monster m){
		System.out.println("");
		System.out.println("宿主：ようこそ");
		System.out.println("1泊　");
		h.hp=h.maxHP;
		Main.action(h,m);
	}

}
