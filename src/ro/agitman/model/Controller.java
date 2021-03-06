//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 10:14:20 AM CEST 
//


package ro.agitman.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setProperty"
})
@XmlRootElement(name = "controller")
public class Controller {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "bufferSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bufferSize;
    @XmlAttribute(name = "className")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String className;
    @XmlAttribute(name = "contentType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contentType;
    @XmlAttribute(name = "debug")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String debug;
    @XmlAttribute(name = "forwardPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String forwardPattern;
    @XmlAttribute(name = "inputForward")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inputForward;
    @XmlAttribute(name = "locale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locale;
    @XmlAttribute(name = "maxFileSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxFileSize;
    @XmlAttribute(name = "memFileSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String memFileSize;
    @XmlAttribute(name = "multipartClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String multipartClass;
    @XmlAttribute(name = "nocache")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nocache;
    @XmlAttribute(name = "pagePattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pagePattern;
    @XmlAttribute(name = "processorClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String processorClass;
    @XmlAttribute(name = "tempDir")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tempDir;
    @XmlElement(name = "set-property")
    protected List<SetProperty> setProperty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the bufferSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferSize() {
        return bufferSize;
    }

    /**
     * Sets the value of the bufferSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferSize(String value) {
        this.bufferSize = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebug(String value) {
        this.debug = value;
    }

    /**
     * Gets the value of the forwardPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardPattern() {
        return forwardPattern;
    }

    /**
     * Sets the value of the forwardPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardPattern(String value) {
        this.forwardPattern = value;
    }

    /**
     * Gets the value of the inputForward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputForward() {
        return inputForward;
    }

    /**
     * Sets the value of the inputForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputForward(String value) {
        this.inputForward = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFileSize(String value) {
        this.maxFileSize = value;
    }

    /**
     * Gets the value of the memFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemFileSize() {
        return memFileSize;
    }

    /**
     * Sets the value of the memFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemFileSize(String value) {
        this.memFileSize = value;
    }

    /**
     * Gets the value of the multipartClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipartClass() {
        return multipartClass;
    }

    /**
     * Sets the value of the multipartClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipartClass(String value) {
        this.multipartClass = value;
    }

    /**
     * Gets the value of the nocache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNocache() {
        return nocache;
    }

    /**
     * Sets the value of the nocache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNocache(String value) {
        this.nocache = value;
    }

    /**
     * Gets the value of the pagePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagePattern() {
        return pagePattern;
    }

    /**
     * Sets the value of the pagePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagePattern(String value) {
        this.pagePattern = value;
    }

    /**
     * Gets the value of the processorClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorClass() {
        return processorClass;
    }

    /**
     * Sets the value of the processorClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorClass(String value) {
        this.processorClass = value;
    }

    /**
     * Gets the value of the tempDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempDir() {
        return tempDir;
    }

    /**
     * Sets the value of the tempDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempDir(String value) {
        this.tempDir = value;
    }

    /**
     * Gets the value of the setProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetProperty }
     * 
     * 
     */
    public List<SetProperty> getSetProperty() {
        if (setProperty == null) {
            setProperty = new ArrayList<SetProperty>();
        }
        return this.setProperty;
    }

}
