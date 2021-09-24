package Utils;

import org.json.JSONObject;

public class JsonHelper
{
    public static String convertTaskName(String roundTitle,String title, String taskNameMessage)
    {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObjectTaskName = new JSONObject();

        jsonObjectTaskName.put("type","object");

        JSONObject jsonObjectPropertiesTaskName = new JSONObject();

        jsonObjectPropertiesTaskName.put("roundTitle",roundTitle.toUpperCase() + " TASK");
        jsonObjectPropertiesTaskName.put("title",title.toUpperCase() + " TASK");
        jsonObjectPropertiesTaskName.put("message",taskNameMessage);

        jsonObjectTaskName.put("properties",jsonObjectPropertiesTaskName);

        jsonObject.put("taskNameIntentTemplateData",jsonObjectTaskName);

        return jsonObject.toString();
    }

    public static String convertTaskResult(String taskResultHeading, String taskResultMessage)
    {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObjectTaskName = new JSONObject();

        jsonObjectTaskName.put("type","object");

        JSONObject jsonObjectPropertiesTaskName = new JSONObject();

        jsonObjectPropertiesTaskName.put("taskResultHeading",taskResultHeading);
        jsonObjectPropertiesTaskName.put("taskResultMessage",taskResultMessage);

        jsonObjectTaskName.put("properties",jsonObjectPropertiesTaskName);

        jsonObject.put("taskResultTemplateData",jsonObjectTaskName);

        return jsonObject.toString();
    }

    public static String convertSearchText(String searchTextMessage)
    {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObjectTaskName = new JSONObject();

        jsonObjectTaskName.put("type","object");

        JSONObject jsonObjectPropertiesTaskName = new JSONObject();

        jsonObjectPropertiesTaskName.put("searchTextMessage",searchTextMessage);

        jsonObjectTaskName.put("properties",jsonObjectPropertiesTaskName);

        jsonObject.put("searchTextTemplateData",jsonObjectTaskName);

        return jsonObject.toString();
    }

    public static String convertSearchObject(String searchObjectMessage)
    {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObjectTaskName = new JSONObject();

        jsonObjectTaskName.put("type","object");

        JSONObject jsonObjectPropertiesTaskName = new JSONObject();

        jsonObjectPropertiesTaskName.put("searchObjectMessage",searchObjectMessage);

        jsonObjectTaskName.put("properties",jsonObjectPropertiesTaskName);

        jsonObject.put("searchObjectTemplateData",jsonObjectTaskName);

        return jsonObject.toString();
    }

    static String convertSimpleWithHeader(String roundTitle, String title, String message)
    {
        JSONObject jsonObject = new JSONObject();

        JSONObject jsonObjectSimple = new JSONObject();

        jsonObjectSimple.put("type","object");

        JSONObject jsonObjectSimpleProperties = new JSONObject();

        jsonObjectSimpleProperties.put("roundTitle",roundTitle.toUpperCase());
        jsonObjectSimpleProperties.put("title",title.toUpperCase());
        jsonObjectSimpleProperties.put("message",message);

        jsonObjectSimple.put("properties",jsonObjectSimpleProperties);

        jsonObject.put("simpleWithHeaderTemplateData",jsonObjectSimple);

        return jsonObject.toString();
    }
}
