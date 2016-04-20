/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdshop;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DANNY
 */
@Entity
@Table(name = "customers", catalog = "posdatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByCustomerId", query = "SELECT c FROM Customers c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customers.findByCustomerName", query = "SELECT c FROM Customers c WHERE c.customerName = :customerName"),
    @NamedQuery(name = "Customers.findByCustomerLastname", query = "SELECT c FROM Customers c WHERE c.customerLastname = :customerLastname"),
    @NamedQuery(name = "Customers.findByCustomerPhone", query = "SELECT c FROM Customers c WHERE c.customerPhone = :customerPhone")})
public class Customers implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_lastname")
    private String customerLastname;
    @Column(name = "customer_phone")
    private String customerPhone;

    public Customers() {
    }

    public Customers(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        Integer oldCustomerId = this.customerId;
        this.customerId = customerId;
        changeSupport.firePropertyChange("customerId", oldCustomerId, customerId);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        String oldCustomerName = this.customerName;
        this.customerName = customerName;
        changeSupport.firePropertyChange("customerName", oldCustomerName, customerName);
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        String oldCustomerLastname = this.customerLastname;
        this.customerLastname = customerLastname;
        changeSupport.firePropertyChange("customerLastname", oldCustomerLastname, customerLastname);
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        String oldCustomerPhone = this.customerPhone;
        this.customerPhone = customerPhone;
        changeSupport.firePropertyChange("customerPhone", oldCustomerPhone, customerPhone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mdshop.Customers[ customerId=" + customerId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
