package dev.it.services.management;

public final class AppConstants {

    public static final String MULTIPLE_VALUES_SEPARATOR = ",|;";
    public static final String COMMA_SEPARATOR = ",";
    public static final String ORDER_BY_CLAUSE_SEPARATOR = ":";
    public static final String BLACKLIST_CHARACTERS_REGEX = "([%'])";

    public static final String API_PATH = "/api/v1";
    public static final String ATTACHMENTS_PATH = API_PATH + "/attachments";
    public static final String ACTIONS_PATH = API_PATH + "/actions";
    public static final String BLOGPOSTS_PATH = API_PATH + "/blogposts";
    public static final String COMPANIES_PATH = API_PATH + "/companies";
    public static final String DEVELOPERS_PATH = API_PATH + "/developers";
    public static final String PERFORMED_ACTIONS_PATH = API_PATH + "/performed-actions";
    public static final String PERFORMED_ACTIONS_BLOGPOSTS_PATH = API_PATH + "/performed-actions-blogpost";
    public static final String PROJECTS_PATH = API_PATH + "/projects";
    public static final String USERS_PATH = API_PATH + "/users";
    public static final String TAGS_PATH = API_PATH + "/tags";

    //TABLE NAMES
    public static final String TABLE_NAME = "developers";


    // USER ROLES
    public static final String ADMIN_ROLE = "admin";
    public static final String MANAGER_ROLE = "manager";
    public static final String USER_ROLE = "user";

}
