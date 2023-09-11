import java.io.IOException;
public class ExecuteScriptWithFactory {
	public static void main(String[] args) {
        // Usage example
        ScriptExecutorFactory executorFactory = new ScriptExecutorFactory();
        String scriptType = "powershell"; // Change this to "powershell" if needed
        String scriptPath = "\"C:\\Document\\myscript.bat\""; // Replace with the actual script path
        ScriptExecutor scriptExecutor = executorFactory.createScriptExecutor(scriptType, scriptPath);
        scriptExecutor.execute();
    }
}

