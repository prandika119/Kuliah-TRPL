package Menus;

public class MenuManager
{
    private final GameOverMenu gameOverMenu;
    private final HelpMenu helpMenu;
    private final HighScoreMenu highScoresMenu;
    private final StartMenu startMenu;
    public MenuManager()
    {
        startMenu = new StartMenu();
        helpMenu = new HelpMenu();
        highScoresMenu = new HighScoreMenu();
        gameOverMenu = new GameOverMenu();
    }
    public GameOverMenu getGameOverMenu()
    {
        return gameOverMenu;
    }
    public HelpMenu getHelpMenu()
    {
        return helpMenu;
    }
    public HighScoreMenu getHighScoresMenu()
    {
        return highScoresMenu;
    }
    public StartMenu getStartMenu()
    {
        return startMenu;
    }
}