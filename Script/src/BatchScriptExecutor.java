import java.io.IOException;
public class BatchScriptExecutor implements ScriptExecutor {
	 private String scriptPath;

	    public BatchScriptExecutor(String scriptPath) {
	        this.scriptPath = scriptPath;
	    }
	    @Override
	    public void execute() {
	        try {
	            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", scriptPath);
	            processBuilder.inheritIO();
	            Process process = processBuilder.start();
	            int exitCode = process.waitFor();
	            if (exitCode == 0) {
	                System.out.println("Batch script executed successfully.");
	            } else {
	                System.err.println("Batch script execution failed with exit code " + exitCode);
	            }
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}

	   