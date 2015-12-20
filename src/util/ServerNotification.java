package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by Sajid Hasan on 12/16/2015.
 */
public class ServerNotification implements Serializable
{
    String command;
    String newOnlineUser;
    ArrayList<String> onlineNowUsersList;
    Hashtable<String, ArrayList<String>> messages;

    public ServerNotification ( String command )
    {
        this.command = command;
    }

    public ServerNotification ( String command, ArrayList<String> onlineNowUsersList)
    {
        this.command = command;
        this.onlineNowUsersList = onlineNowUsersList;
    }

    public ServerNotification ( String command, String newOnlineUser )
    {
        this.command = command;
        this.newOnlineUser = newOnlineUser;
    }

    public ServerNotification ( String command, ArrayList<String> onlineNowUsersList, Hashtable<String, ArrayList<String>> messages )
    {
        this.command = command;
        this.onlineNowUsersList = onlineNowUsersList;
        this.messages = messages;
    }

    public String getCommand ()
    {
        return command;
    }

    public void setCommand ( String command )
    {
        this.command = command;
    }

    public String getNewOnlineUser ()
    {
        return newOnlineUser;
    }

    public void setNewOnlineUser ( String newOnlineUser )
    {
        this.newOnlineUser = newOnlineUser;
    }

    public ArrayList<String> getOnlineNowUsersList ()
    {
        return onlineNowUsersList;
    }

    public void setOnlineNowUsersList ( ArrayList<String> onlineNowUsersList )
    {
        this.onlineNowUsersList = onlineNowUsersList;
    }

    public Hashtable<String, ArrayList<String>> getMessages ()
    {
        return messages;
    }
}
