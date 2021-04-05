/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.beans;

import java.util.Date;

/**
 *
 * @author marek
 */
public class SessionTrackerBean {

    private String ip;
    private Date lastAccess;

    public SessionTrackerBean() {
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the lastAccess
     */
    public Date getLastAccess() {
        return lastAccess;
    }

    /**
     * @param lastAccess the lastAccess to set
     */
    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

}
