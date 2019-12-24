/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2.pkg1;

/**
 *
 * @author Shreeni
 */
public class NewClass {
    int[] values= {0,0,0,0,0,0,0,0,0};//store x and o
    int[] valuescomp={0,0,0,0,0,0,0,0,0};
    int temp2=1; // to check if the turn should be marked as is x or o
    int player1=0; // player 1 win count 
    int player2=0; // player 2 win count 
    int temp3; // used as temp for adding wins to players
    int ra1=1; 
    int count;
    int draw1=0;
    
    
    
    public int check(int ab) // for changning x / o after each click  and also to call check function for checking wins 
    {  
        int checkCondition= temp2;
        int rvalue=0;
        if(values[ab]==0)
        {
            if (checkCondition==1)
            {
                rvalue=1;


            }
            if (checkCondition==-1)
            {
                 rvalue=-1;
            }

            temp2=temp2*(-1);
            storeValues(ab, rvalue);
            count=count+1; 
          
        }
            temp3=checkG();

            storeWinner(temp3);
            if(temp3==1 || temp3==2)
            {
                changeX();
            }
            
            
        

        return rvalue;


       
    }
    public int tempWinner1()//returns the wins for player 1 to fxmldocumentcontroller
    {
        return player1;
    }
    public int tempWinner2()//returns the wins for player 2 to fxmldocumentcontroller
    {
        return player2;
    }
    public void storeWinner(int dc) // to store winner counts 
    {
      if(ra1==1)
      {
        if (dc==1)
        {
           player1=player1+1;
        }
        if (dc==2)
        {
          player2=player2+1;  
         }
      }
      if(ra1==-1)
      {
        if (dc==1)
        {
           player2=player2+1;
        }
        if (dc==2)
        {
          player1=player1+1;  
      }
      }
      
    }
    public void switchTurn()//switch x and o to be printed  after click 
    {
        temp2=temp2*(-1);
        
        
    }
    
    public void storeValues(int x_index,int x_values) //stores x and o values in a  array
    {
        
        values[x_index]=x_values;
        int temp1=checkG();
        
    }
    public int checkG()// to check if a player won that round 
    {
        int b=0;
        if (values[0]==1 && values[1]==1 && values[2]==1 )
        {
            b=1;
            
        }
        if (values[3]==1 && values[4]==1 && values[5]==1 )
        {
            b=1;
            
        }
        if (values[6]==1 && values[7]==1 && values[8]==1 )
        {
            b=1;
            
        }
        if (values[0]==1 && values[3]==1 && values[6]==1 )
        {
            b=1;
            
        }
        if (values[1]==1 && values[4]==1 && values[7]==1 )
        {
            b=1;
            
        }
        if (values[2]==1 && values[5]==1 && values[8]==1 )
        {
            b=1;
            
        }
        if (values[0]==1 && values[4]==1 && values[8]==1 )
        {
            b=1;
            
        }
        if (values[2]==1 && values[4]==1 && values[6]==1 )
        {
            b=1;
            
        }
        if (values[0]==-1 && values[1]==-1 && values[2]==-1 )
        {
            b=2;
            
        }
        if (values[3]==-1 && values[4]==-1 && values[5]==-1 )
        {
            b=2;
            
        }
        if (values[6]==-1 && values[7]==-1 && values[8]==-1 )
        {
            b=2;
            
        }
        if (values[0]==-1 && values[3]==-1 && values[6]==-1 )
        {
            b=2;
            
        }
        if (values[1]==-1 && values[4]==-1 && values[7]==-1 )
        {
            b=2;
            
        }
        if (values[2]==-1 && values[5]==-1 && values[8]==-1 )
        {
            b=2;
            
        }
        if (values[0]==-1 && values[4]==-1 && values[8]==-1 )
        {
            b=2;
            
        }
        if (values[2]==-1 && values[4]==-1 && values[6]==-1 )
        {
            b=2;
            
        }
           return b;
    }
    
    public int resetAfterWin()//reset the tictoktoe board after each win 
    {
      int ra=0;
      int t1=0;
      if(temp3!=1 && temp3!=2)
      {
        t1=checkdraw();
      }
              
      
      
      if(temp3==1 || temp3==2 ||  t1==1)
      {
       

        for(int i1=0;i1<9;i1++)
        {
            
            {
               values[i1]=0;
               temp2=1;
                ra=1;
                count=0;
                
            }
                
           
        }
        
      }
      
     return ra;


   
    
    }
    public void changeX()// to change which player plays x after each win / draw 
    {
        ra1=ra1*(-1);
    }
    public void resetbuttonact()// resets the complete game and starts new one 
    {
        for(int i2=0;i2<9;i2++)
           {

               {
                  values[i2]=0;
                  temp2=1;


               }


           }
        count=0;

        player1=0;
        player2=0;

        ra1=1;
    }
    public int checkdraw()// to check if a game is draw 
    {
        int drawt1=0;
        if(values!=valuescomp && count==9)
        {
           draw1=draw1+1; 
           drawt1=1;
           count=0;
            
           
        }
        return drawt1;
    }
    public int rdraw()
    {
        return draw1;
    }
}
