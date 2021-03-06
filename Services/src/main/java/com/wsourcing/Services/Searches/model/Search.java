package com.wsourcing.Services.Searches.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;


//Define the state of a search for a precise organism
//Define different datas relating to the search on one precise organism
@Document(collection = "searches")
public class Search {


    //Used to auto-generate ACCOUNT id with long type in the database
    //mongodb id is a STRING type without auto-generate function
    @Transient
    public static final String SEQUENCE_NAME = "searches_sequence";

    @Id
    private long id ;
    private String searchName;
    private ArrayList<String> mandatorySkills;
    private ArrayList<String> optionalSkills;
    //no more searches on this organism
    private boolean isHalted ;
    private int totalURLsFound ;
    private int totalNewUrls ;
    private int totalDistinctURLs;
    private int totalProfilesScraped ;
    //the priority of this search for this specified organism
    private int urgency ;
    //organism on which the searche are going on
    private String organisme ;

    public Search() {
    }


    public Search(long id, String searchName, ArrayList<String> mandatorySkills, ArrayList<String> optionalSkills, boolean isHalted, int totalURLsFound, int totalNewUrls, int totalDistinctURLs, int totalProfilesScraped, int urgency, String organisme) {
        this.id = id;
        this.searchName = searchName;
        this.mandatorySkills = mandatorySkills;
        this.optionalSkills = optionalSkills;
        this.isHalted = isHalted;
        this.totalURLsFound = totalURLsFound;
        this.totalNewUrls = totalNewUrls;
        this.totalDistinctURLs = totalDistinctURLs;
        this.totalProfilesScraped = totalProfilesScraped;
        this.urgency = urgency;
        this.organisme = organisme;
    }

    public Search(String searchName, ArrayList<String> mandatorySkills, ArrayList<String> optionalSkills, boolean isHalted, int totalURLsFound, int totalNewUrls, int totalDistinctURLs, int totalProfilesScraped, int urgency, String organisme) {
        this.searchName = searchName;
        this.mandatorySkills = mandatorySkills;
        this.optionalSkills = optionalSkills;
        this.isHalted = isHalted;
        this.totalURLsFound = totalURLsFound;
        this.totalNewUrls = totalNewUrls;
        this.totalDistinctURLs = totalDistinctURLs;
        this.totalProfilesScraped = totalProfilesScraped;
        this.urgency = urgency;
        this.organisme = organisme;
    }


    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public ArrayList<String> getMandatorySkills() {
        return mandatorySkills;
    }

    public void setMandatorySkills(ArrayList<String> mandatorySkills) {
        this.mandatorySkills = mandatorySkills;
    }

    public ArrayList<String> getOptionalSkills() {
        return optionalSkills;
    }

    public void setOptionalSkills(ArrayList<String> optionalSkills) {
        this.optionalSkills = optionalSkills;
    }

    public static String getSequenceName() {
        return SEQUENCE_NAME;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }


    public boolean isHalted() {
        return isHalted;
    }

    public void setHalted(boolean halted) {
        isHalted = halted;
    }

    public int getTotalURLsFound() {
        return totalURLsFound;
    }

    public void setTotalURLsFound(int totalURLsFound) {
        this.totalURLsFound = totalURLsFound;
    }

    public int getTotalNewUrls() {
        return totalNewUrls;
    }

    public void setTotalNewUrls(int totalNewUrls) {
        this.totalNewUrls = totalNewUrls;
    }

    public int getTotalDistinctURLs() {
        return totalDistinctURLs;
    }

    public void setTotalDistinctURLs(int totalDistinctURLs) {
        this.totalDistinctURLs = totalDistinctURLs;
    }

    public int getTotalProfilesScraped() {
        return totalProfilesScraped;
    }

    public void setTotalProfilesScraped(int totalProfilesScraped) {
        this.totalProfilesScraped = totalProfilesScraped;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }
}
