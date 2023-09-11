import java.io.IOException;

public class ExecuteBatchScript {
    public static void main(String[] args) {
        try {
            // Define the batch script to execute
            String batchScript = "\"C:\\Document\\myscript.bat\""; // Replace with the actual path to your batch script

            // Create a ProcessBuilder for the batch script
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", batchScript);
            
            // Redirect the output to the console
            processBuilder.inheritIO();

            // Start the process
            Process process = processBuilder.start();

            // Wait for the process to finish
            int exitCode = process.waitFor();

            // Check the exit code
            if (exitCode == 0) {
                System.out.println("Script executed successfully.");
            } else {
                System.err.println("Script execution failed with exit code " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
