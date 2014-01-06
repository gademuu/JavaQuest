/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client2.glossary;

import backend.Word;

/**
 *
 * @author herman
 */
public interface GlossaryViewSetter {
    
    public void  setGlossaryList(Word[] list);
    public void setGlossaryViewListener(GlossaryViewListener listener);
    
}
