public class PlayerRecord {
    private String name;
    private int age;
    private int salary;
    public PlayerRecord(){}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}

class ClubOwner{
    String name;
    PlayerRecord[] players;
    public ClubOwner(String name){
        this.name=name;
        this.players=new PlayerRecord[7];
    }
    public String getPlayer(int ind){
        ind--;
        return String.format("%-13s %-5d %-8d",players[ind].getName(),players[ind].getAge(),players[ind].getSalary());
    }
    public void setPlayer(String name,int age,int salary,int ind){
        ind--;
        PlayerRecord newPlayer = new PlayerRecord();
        newPlayer.setName(name);
        newPlayer.setAge(age);
        newPlayer.setSalary(salary);
        players[ind]=newPlayer;
    }
    public String getHighestPaidPlayer(){
        int highest=-1;
        String highestPaidPlayer="";
        for(int pos=0;pos<7;pos++){
            if(players[pos].getSalary()>highest){
                highest=players[pos].getSalary();
                highestPaidPlayer=players[pos].getName();
            }
        }
        return  highestPaidPlayer;
    }
}
