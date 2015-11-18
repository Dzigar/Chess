/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.EventListener;

/**
 *
 * @author dzigar
 */
public interface DataListener extends EventListener {

    void updateTextGuiLanguageInfo(UpdateGuiEvent e);

    void updateGUI(UpdateGuiEvent e);

    void noBlackCkeckersLeft(UpdateGuiEvent e);

    void noWhiteCkeckersLeft(UpdateGuiEvent e);

    void blackIsBlocked(UpdateGuiEvent e);

    void whiteIsBlocked(UpdateGuiEvent e);
}
