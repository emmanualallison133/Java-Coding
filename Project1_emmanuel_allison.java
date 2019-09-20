import javax.swing.JOptionPane;

public class Project1_emmanuel_allison
{
   public static void main(String[] args)
   {
      double GPU_speed, CPU_speed, ProcessorCores, resolutionChoice;
      double performanceScore;
      String inputString;
      String programTitle = "Computer Hardware Graphics Quality Recommendation Tool";
      
      inputString =
         JOptionPane.showInputDialog("Please enter the clock speed " +
                                "(in Megahertz) of your graphics card: ");
      
      GPU_speed = Integer.parseInt(inputString);
      
      inputString =
         JOptionPane.showInputDialog("Please enter the clock speed " +
                                "(in Megahertz) of your processor: ");
      
      CPU_speed = Integer.parseInt(inputString);          
      
      inputString =
         JOptionPane.showInputDialog("Please enter the the number of cores " +
                                    "of your processor: ");
      
      ProcessorCores = Integer.parseInt(inputString);
      
      inputString =
         JOptionPane.showInputDialog("What is the resolution of your monitor?\n\n" +
         
                                        "\t\t\t1. 1280 x 720\n" +
                                        "\t\t\t2. 1920 x 1080\n" +
                                        "\t\t\t3. 2560 x 1440\n" +
                                        "\t\t\t4. 3840 x 2160\n\n" +
                                        
                                     "Please select from the options above: ");
                                        
      resolutionChoice = Integer.parseInt(inputString);

      switch (resolutionChoice)
      {
         case 1:

            double multiplier = 1.00;
            String Recommended_Graphics_Quality;
            
            performanceScore = ((5 * GPU_speed) + (ProcessorCores * CPU_speed)) * multiplier;
            
            switch (performanceScore)
            {
               case performanceScore > 17000:
                  Recommended_Graphics_Quality = "Ultra";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1280 x 720\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
                  
                  break;
               
               case performanceScore >= 15000 && performanceScore <= 17000:
                  
                  Recommended_Graphics_Quality = "High";
                  
                  JOptionPane.showMessageDialog(null, String.format(programTitle + "%s\n\n" +
                                         
                                        "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1280 x 720\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));                  
                  break;
                  
               case performanceScore >= 13000 && performanceScore < 15000:
                  Recommended_Graphics_Quality = "Medium";
                  
                  JOptionPane.showMessageDialog(null, String.format(programTitle + "%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1280 x 720\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
            
                  
                  break;
                  
               case performanceScore >= 11000 && performanceScore < 13000:
                  Recommended_Graphics_Quality = "Low";
                  
                  JOptionPane.showMessageDialog(null, String.format(programTitle + "%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1280 x 720\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));            
                  
                  break;
                  
               case performanceScore < 11000:
                  Recommended_Graphics_Quality = "Unable to Play";
                  
                  JOptionPane.showMessageDialog(null, String.format(programTitle + "%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1280 x 720\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));            
                  
                  break;
          break;

          
          case 2:
            double multiplier = 0.75;
            String Recommended_Graphics_Quality;
            
            performanceScore = ((5 * GPU_speed) + (ProcessorCores * CPU_speed)) * multiplier;
            
            switch (performanceScore)
            {
               case performanceScore > 17000:
                  Recommended_Graphics_Quality = "Ultra";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1920 x 1080\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));            
                  
                  break;
               
               case performanceScore >= 15000 && performanceScore <= 17000:
                  Recommended_Graphics_Quality = "High";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1920 x 1080\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));            
                  
                  break;
                  
               case performanceScore >= 13000 && performanceScore < 15000:
                  Recommended_Graphics_Quality = "Medium";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1920 x 1080\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
            
                  
                  break;
                  
               case performanceScore >= 11000 && performanceScore < 13000:
                  Recommended_Graphics_Quality = "Low";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1920 x 1080\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
            
                  
                  break;
                  
               case performanceScore < 11000:
                  Recommended_Graphics_Quality = "Unable to Play";
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 1920 x 1080\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
            
                  
                  break;
            break;

            
            case 3:
               double multiplier = 0.55;
               String Recommended_Graphics_Quality;
               
               performanceScore = ((5 * GPU_speed) + (ProcessorCores * CPU_speed)) * multiplier;
               
               switch (performanceScore)
               {
                  case performanceScore > 17000:
                     Recommended_Graphics_Quality = "Ultra";
                     JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 2560 x 1440\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));            
                     
                     break;
                  
                  case performanceScore >= 15000 && performanceScore <= 17000:
                     Recommended_Graphics_Quality = "High";
                     
                     JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 2560 x 1440\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
            
                     
                     break;
                     
                  case performanceScore >= 13000 && performanceScore < 15000:
                     Recommended_Graphics_Quality = "Medium";
                     
                     JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 2560 x 1440\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));
                     
                     break;
                     
                  case performanceScore >= 11000 && performanceScore < 13000:
                     Recommended_Graphics_Quality = "Low";
                     
                     JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 2560 x 1440\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                     
                     break;
                     
                  case performanceScore < 11000:
                     Recommended_Graphics_Quality = "Unable to Play";
                     JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 2560 x 1440\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                     
                     break;
               break;

           case 4:
        
            double multiplier = 0.35;
            String Recommended_Graphics_Quality;
            
            performanceScore = ((5 * GPU_speed) + (ProcessorCores * CPU_speed)) * multiplier;
            
            switch (performanceScore)
            {
               case performanceScore > 17000:
                  Recommended_Graphics_Quality = "Ultra";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 3840 x 2160\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                  
                  break;
               
               case performanceScore >= 15000 && performanceScore <= 17000:
                  Recommended_Graphics_Quality = "High";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 3840 x 2160\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                  
                  break;
                  
               case performanceScore >= 13000 && performanceScore < 15000:
                  Recommended_Graphics_Quality = "Medium";
                  
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 3840 x 2160\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                  
                  break;
                  
               case performanceScore >= 11000 && performanceScore < 13000:
                  Recommended_Graphics_Quality = "Low";
                                    
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 3840 x 2160\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                  
                  break;
                  
               case performanceScore < 11000:
                  Recommended_Graphics_Quality = "Unable to Play";
                             
                  JOptionPane.showMessageDialog(null, String.format("%s\n\n" +
                                         
                                         "GPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "CPU Clock Speed: %.1f\t\t\t\n MHz" +
                                         "Number of Cores: %.0f\t\t\t\n" +
                                         "Monitor Resolution: 3840 x 2160\t\t\t\n" +
                                         "Performance Score: %.3f\t\t\t\n" +
                                         "Recommended_Graphics_Quality: %s", programTitle,GPU_speed, CPU_speed, ProcessorCores, performanceScore, Recommended_Graphics_Quality));

            
                  
                  break;
            break;
            System.exit(0);
            
        }
                                         
      }
   }
   
  
 }
   }
}