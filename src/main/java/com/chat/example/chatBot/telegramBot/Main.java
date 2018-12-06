package com.chat.example.chatBot.telegramBot;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONException;

import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

	public static void main(String[] args) {
        TelegramBot tb = new TelegramBot("611047872:AAEV4nNzzM2t9hHSD_sE_wt1yJL0NfSOQbs");
        try {
            tb.run();
        } catch (UnirestException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException e) {
			e.printStackTrace();
		}
    }
}
