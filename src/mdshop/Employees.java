/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdshop;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author DANNY
 */
@Entity
@Table(name = "employees", catalog = "posdatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findByEmployeeId", query = "SELECT e FROM Employees e WHERE e.employeeId = :employeeId"),
    @NamedQuery(name = "Employees.findByEmployeeName", query = "SELECT e FROM Employees e WHERE e.employeeName = :employeeName"),
    @NamedQuery(name = "Employees.findByEmployeeLastname", query = "SELECT e FROM Employees e WHERE e.employeeLastname = :employeeLastname"),
    @NamedQuery(name = "Employees.findByEmployeeGender", query = "SELECT e FROM Employees e WHERE e.employeeGender = :employeeGender"),
    @NamedQuery(name = "Employees.findByEmployeeDob", query = "SELECT e FROM Employees e WHERE e.employeeDob = :employeeDob"),
    @NamedQuery(name = "Employees.findByEmployeePhone", query = "SELECT e FROM Employees e WHERE e.employeePhone = :employeePhone"),
    @NamedQuery(name = "Employees.findByEmployeeAddress", query = "SELECT e FROM Employees e WHERE e.employeeAddress = :employeeAddress"),
    @NamedQuery(name = "Employees.findByEmployeePosition", query = "SELECT e FROM Employees e WHERE e.employeePosition = :employeePosition"),
    @NamedQuery(name = "Employees.findByEmployeePassword", query = "SELECT e FROM Employees e WHERE e.employeePassword = :employeePassword")})
public class Employees implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_lastname")
    private String employeeLastname;
    @Column(name = "employee_gender")
    private String employeeGender;
    @Column(name = "employee_dob")
    @Temporal(TemporalType.DATE)
    private Date employeeDob;
    @Column(name = "employee_phone")
    private Integer employeePhone;
    @Column(name = "employee_address")
    private String employeeAddress;
    @Column(name = "employee_position")
    private String employeePosition;
    @Column(name = "employee_password")
    private String employeePassword;

    public Employees() {
    }

    public Employees(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        Integer oldEmployeeId = this.employeeId;
        this.employeeId = employeeId;
        changeSupport.firePropertyChange("employeeId", oldEmployeeId, employeeId);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        String oldEmployeeName = this.employeeName;
        this.employeeName = employeeName;
        changeSupport.firePropertyChange("employeeName", oldEmployeeName, employeeName);
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        String oldEmployeeLastname = this.employeeLastname;
        this.employeeLastname = employeeLastname;
        changeSupport.firePropertyChange("employeeLastname", oldEmployeeLastname, employeeLastname);
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        String oldEmployeeGender = this.employeeGender;
        this.employeeGender = employeeGender;
        changeSupport.firePropertyChange("employeeGender", oldEmployeeGender, employeeGender);
    }

    public Date getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(Date employeeDob) {
        Date oldEmployeeDob = this.employeeDob;
        this.employeeDob = employeeDob;
        changeSupport.firePropertyChange("employeeDob", oldEmployeeDob, employeeDob);
    }

    public Integer getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Integer employeePhone) {
        Integer oldEmployeePhone = this.employeePhone;
        this.employeePhone = employeePhone;
        changeSupport.firePropertyChange("employeePhone", oldEmployeePhone, employeePhone);
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        String oldEmployeeAddress = this.employeeAddress;
        this.employeeAddress = employeeAddress;
        changeSupport.firePropertyChange("employeeAddress", oldEmployeeAddress, employeeAddress);
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        String oldEmployeePosition = this.employeePosition;
        this.employeePosition = employeePosition;
        changeSupport.firePropertyChange("employeePosition", oldEmployeePosition, employeePosition);
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        String oldEmployeePassword = this.employeePassword;
        this.employeePassword = employeePassword;
        changeSupport.firePropertyChange("employeePassword", oldEmployeePassword, employeePassword);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mdshop.Employees[ employeeId=" + employeeId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
