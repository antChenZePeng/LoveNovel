package com.wenzhi.novel.mysql.model;

public class CS_GameSerieList {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CS_GameSerieList.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CS_GameSerieList.GameSerieID
     *
     * @mbggenerated
     */
    private Integer gameserieid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CS_GameSerieList.PlatFormId
     *
     * @mbggenerated
     */
    private String platformid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CS_GameSerieList.GameName
     *
     * @mbggenerated
     */
    private String gamename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CS_GameSerieList.GameId
     *
     * @mbggenerated
     */
    private String gameid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CS_GameSerieList.ID
     *
     * @return the value of CS_GameSerieList.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CS_GameSerieList.ID
     *
     * @param id the value for CS_GameSerieList.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CS_GameSerieList.GameSerieID
     *
     * @return the value of CS_GameSerieList.GameSerieID
     *
     * @mbggenerated
     */
    public Integer getGameserieid() {
        return gameserieid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CS_GameSerieList.GameSerieID
     *
     * @param gameserieid the value for CS_GameSerieList.GameSerieID
     *
     * @mbggenerated
     */
    public void setGameserieid(Integer gameserieid) {
        this.gameserieid = gameserieid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CS_GameSerieList.PlatFormId
     *
     * @return the value of CS_GameSerieList.PlatFormId
     *
     * @mbggenerated
     */
    public String getPlatformid() {
        return platformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CS_GameSerieList.PlatFormId
     *
     * @param platformid the value for CS_GameSerieList.PlatFormId
     *
     * @mbggenerated
     */
    public void setPlatformid(String platformid) {
        this.platformid = platformid == null ? null : platformid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CS_GameSerieList.GameName
     *
     * @return the value of CS_GameSerieList.GameName
     *
     * @mbggenerated
     */
    public String getGamename() {
        return gamename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CS_GameSerieList.GameName
     *
     * @param gamename the value for CS_GameSerieList.GameName
     *
     * @mbggenerated
     */
    public void setGamename(String gamename) {
        this.gamename = gamename == null ? null : gamename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CS_GameSerieList.GameId
     *
     * @return the value of CS_GameSerieList.GameId
     *
     * @mbggenerated
     */
    public String getGameid() {
        return gameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CS_GameSerieList.GameId
     *
     * @param gameid the value for CS_GameSerieList.GameId
     *
     * @mbggenerated
     */
    public void setGameid(String gameid) {
        this.gameid = gameid == null ? null : gameid.trim();
    }
}