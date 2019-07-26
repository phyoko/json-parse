import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.json.parse.model.Data;

public class Main {

    public static void main(String[] args) throws  Exception {

        String input = "{  \n" +
                "   \"count\":7251,\n" +
                "   \"limit\":150,\n" +
                "   \"offset\":0,\n" +
                "   \"records\":[  \n" +
                "      {  \n" +
                "         \"id\":\"5d177f49e20311b48fc9bddd\",\n" +
                "         \"created_at\":\"2019-07-26T14:28:44Z\",\n" +
                "         \"updated_at\":\"2019-07-26T15:29:53Z\",\n" +
                "         \"custom_field_values\":{  \n" +
                "            \"smartcard_id\":\"014503418775\",\n" +
                "            \"district\":null,\n" +
                "            \"township\":null,\n" +
                "            \"street_name\":null\n" +
                "         },\n" +
                "         \"company\":\"\",\n" +
                "         \"emails\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"firstname\":\"Nang\",\n" +
                "         \"gender\":null,\n" +
                "         \"home_phones\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"identity_ids\":[  \n" +
                "            \"5d177f49e20311b48fc9bddf\"\n" +
                "         ],\n" +
                "         \"lastname\":\"Oo\",\n" +
                "         \"mobile_phones\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"notes\":\"\",\n" +
                "         \"read_only\":false,\n" +
                "         \"tag_ids\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"avatar_url\":\"https://canal-myanmar.engagement.dimelo.com/files/identities/06e/2c7/24c0a61e5531fec724784cbd0e/avatar/thumb_.jpeg?504643\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"id\":\"5c8b9a92eb7025b360b9f0fb\",\n" +
                "         \"created_at\":\"2019-07-19T05:28:09Z\",\n" +
                "         \"updated_at\":\"2019-07-19T05:30:30Z\",\n" +
                "         \"custom_field_values\":{  \n" +
                "            \"smartcard_id\":\"014500859567\",\n" +
                "            \"district\":null,\n" +
                "            \"township\":null,\n" +
                "            \"street_name\":null\n" +
                "         },\n" +
                "         \"company\":\"\",\n" +
                "         \"emails\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"firstname\":\"Win\",\n" +
                "         \"gender\":null,\n" +
                "         \"home_phones\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"identity_ids\":[  \n" +
                "            \"5c8b9a92eb7025b360b9f0fd\"\n" +
                "         ],\n" +
                "         \"lastname\":\"Aung\",\n" +
                "         \"mobile_phones\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"notes\":\"\",\n" +
                "         \"read_only\":false,\n" +
                "         \"tag_ids\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"avatar_url\":\"https://canal-myanmar.engagement.dimelo.com/files/identities/3a1/c41/5fbfc96bb324ef18f754cf3124/avatar/thumb_.jpeg?b551ad\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"id\":\"5d308691e203111f3a7c9477\",\n" +
                "         \"created_at\":\"2019-07-19T05:26:00Z\",\n" +
                "         \"updated_at\":\"2019-07-19T05:28:16Z\",\n" +
                "         \"custom_field_values\":{  \n" +
                "            \"smartcard_id\":\"0095104003967417\",\n" +
                "            \"district\":null,\n" +
                "            \"township\":null,\n" +
                "            \"street_name\":null\n" +
                "         },\n" +
                "         \"company\":\"\",\n" +
                "         \"emails\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"firstname\":\"Zaw\",\n" +
                "         \"gender\":null,\n" +
                "         \"home_phones\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"identity_ids\":[  \n" +
                "            \"5d308691e203111f3a7c9479\"\n" +
                "         ],\n" +
                "         \"lastname\":\"Aung\",\n" +
                "         \"mobile_phones\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"notes\":\"\",\n" +
                "         \"read_only\":false,\n" +
                "         \"tag_ids\":[  \n" +
                "\n" +
                "         ],\n" +
                "         \"avatar_url\":\"https://canal-myanmar.engagement.dimelo.com/files/identities/66f/58c/7518711a25f24797a469c301d6/avatar/thumb_.jpeg?da6216\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();

        Data data = mapper.readValue(input, Data.class);

        System.out.println(data);
    }
}
