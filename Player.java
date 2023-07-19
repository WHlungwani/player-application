package hlungwani.wn.player;
import hlungwani.wn.date.Date;
/**
 *
 * @author GOD IS GOOD
 */
public class Player {
 //Private fields  
private String playerName;
private String playerNurname;             
private String playerTeam;
private int playerJerseyNo; 
private int playerGoals;
private int playerAge;
private Date playerBirthDate;

//Default Constructor
    public Player() 
    {
        this.playerName =" ";
        this.playerNurname = " ";
        this.playerTeam = " ";
        this.playerJerseyNo = 0;
        this.playerGoals = 0;
        this.playerAge = 0;
        this.playerBirthDate = new Date();
    }

    //Paramiterized Constructor
    public Player(String playerName, String playerNurname, String playerTeam, int playerJerseyNo, int playerGoals, Date playerBirthDate) {
        this.playerName = playerName;
        this.playerNurname = playerNurname;
        this.playerTeam = playerTeam;
        this.playerJerseyNo = playerJerseyNo;
        this.playerGoals = playerGoals;
        this.playerAge = playerAge;
        this.playerBirthDate = playerBirthDate;
    }
    
    //Getters Methods
    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerNurname() {
        return playerNurname;
    }

    public String getPlayerTeam() {
        return playerTeam;
    }

    public int getPlayerJerseyNo() {
        return playerJerseyNo;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }
    public int getPlayerAge()
    {
        return playerAge;
    }

    public Date getPlayerBirthDate() {
        return playerBirthDate;
    }
    //Setters Methods

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerNurname(String playerNurname) {
        this.playerNurname = playerNurname;
    }

    public void setPlayerTeam(String playerTeam) {
        this.playerTeam = playerTeam;
    }

    public void setPlayerJerseyNo(int playerJerseyNo) {
        this.playerJerseyNo = playerJerseyNo;
    }

    public void setPlayerGoals(int playerGoal) {
        this.playerGoals = playerGoal;
    }
    public void setPlayerAge(int playerAge)
    {
        this.playerAge = playerAge;
    }

    public void setPlayerBirthDate(Date playerBirthDate) {
        this.playerBirthDate = playerBirthDate;
    }
    //Helper Method1
    
    public boolean qualifyNationalTeam()
    {
     boolean goalsApproved = false;
     
        if (playerGoals >= 15 )
        {
         goalsApproved = true;   
        }
        return goalsApproved;
    }
    
    //Helper Method2
    
    public boolean playerInAGoodForm() 
    {
        boolean goodForm = false;
        
        if (playerAge >=18 && playerAge<=35) 
        {
          goodForm = true;   
        }
        return goodForm;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerNurname=" + playerNurname + ", playerTeam=" + playerTeam + ", playerJerseyNo=" + playerJerseyNo + ", playerGoal=" + playerGoals + ", playerAge="+playerAge+" playerBirthDate=" + playerBirthDate + '}';
    }



    
}
