import java.io.IOException;
class ScriptExecutorFactory {
    public ScriptExecutor createScriptExecutor(String scriptType, String scriptPath) {
        if ("batch".equalsIgnoreCase(scriptType)) {
            return new BatchScriptExecutor(scriptPath);
        } else if ("powershell".equalsIgnoreCase(scriptType)) {
            return new PowerShellScriptExecutor(scriptPath);
        } else {
            throw new IllegalArgumentException("Unsupported script type: " + scriptType);
        }
    }
}

