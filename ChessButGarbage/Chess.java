

public class Chess
{
   public static void main(String[] args){
     String[][] Board;
 Board = new String[8][8];
 
 int c = 0;
      for( int i = 0; c <=8; i++){
         if(i > 7){c++; i =0;} 
          else if(i == 0)Board[i][c] = "A"+c+"";
         else if(i == 1)Board[i][c] = "B"+c+"";
         else if(i == 2)Board[i][c] = "C"+c+"";
         else if(i == 3)Board[i][c] = "D"+c+"";
         else if(i == 4)Board[i][c] = "E"+c+"";
         else if(i == 5)Board[i][c] = "F"+c+"";
         else if(i == 6)Board[i][c] = "G"+c+"";
         else if(i == 7)Board[i][c] = "H"+c+"";
         if(i<=7)System.out.println(Board[i][c]);
          //System.out.println("Space");
     if(c == 7 && i == 7)c = 100;
        }
       
    }
}
 