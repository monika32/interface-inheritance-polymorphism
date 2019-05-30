class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
public class Soccer extends Sports {
	@Override
    String getName(){
    return "Soccer Class";
	}
	void getNumberOfTeamMembers() {
		System.out.println(super.getName());
		super.getNumberOfTeamMembers();
		System.out.println(this.getName());
		 System.out.println( "Each team has 11 players in " + getName() );
	}

	public static void main(String[] args) {
		Soccer s1=new Soccer();
		s1.getNumberOfTeamMembers();
		
	}

}
