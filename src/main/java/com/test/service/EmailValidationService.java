//package com.test.service;
//
//import org.apache.http.client.HttpClient;
//
//import org.apache.http.impl.client.HttpClients;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailValidationService {
//
//    private final String API_BASE_URL = "https://api.trumail.io/v2/verify/";
//
//    private HttpClient httpClient;
//
//    public EmailValidationService() {
//        this.httpClient = HttpClients.createDefault();
//    }
//
//    public boolean isRealEmail(String email) {
//        try {
//            // Construct the API URL
//            String apiUrl = API_BASE_URL + email;
//
//            // Make a GET request to the API
//            HttpGet request = new HttpGet(apiUrl);
//            String responseJson = httpClient.execute(request, response -> {
//                int statusCode = response.getStatusLine().getStatusCode();
//                if (statusCode >= 200 && statusCode < 300) {
//                    return EntityUtils.toString(response.getEntity());
//                } else {
//                    throw new IOException("Unexpected response status: " + statusCode);
//                }
//            });
//
//            // Parse the response JSON
//            JSONObject jsonResponse = new JSONObject(responseJson);
//            String deliverableStatus = jsonResponse.getString("deliverable");
//            String fullInboxStatus = jsonResponse.getString("fullInbox");
//
//            // Return true if the email address is deliverable and the inbox is not full
//            return "true".equalsIgnoreCase(deliverableStatus) && !"true".equalsIgnoreCase(fullInboxStatus);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            // Return false in case of any errors
//            return false;
//        }
//    }
//}
