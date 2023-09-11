import java.io.IOException;
   public class PowerShellScriptExecutor implements ScriptExecutor {
    private String scriptPath;

    public PowerShellScriptExecutor(String scriptPath) {
        this.scriptPath = scriptPath;
    }
    @Override
    public void execute() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("powershell.exe", "-ExecutionPolicy", "Bypass", "-File", scriptPath);
            processBuilder.inheritIO();
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("PowerShell script executed successfully.");
            } else {
                System.err.println("PowerShell script execution failed with exit code " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
