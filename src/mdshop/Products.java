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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "products", catalog = "posdatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductId", query = "SELECT p FROM Products p WHERE p.productId = :productId"),
    @NamedQuery(name = "Products.findByProductPrice", query = "SELECT p FROM Products p WHERE p.productPrice = :productPrice"),
    @NamedQuery(name = "Products.findByProductName", query = "SELECT p FROM Products p WHERE p.productName = :productName"),
    @NamedQuery(name = "Products.findByProductDescription", query = "SELECT p FROM Products p WHERE p.productDescription = :productDescription"),
    @NamedQuery(name = "Products.findByProductColor", query = "SELECT p FROM Products p WHERE p.productColor = :productColor"),
    @NamedQuery(name = "Products.findByProductSize", query = "SELECT p FROM Products p WHERE p.productSize = :productSize"),
    @NamedQuery(name = "Products.findByProductBrand", query = "SELECT p FROM Products p WHERE p.productBrand = :productBrand"),
    @NamedQuery(name = "Products.findByProductBarcode", query = "SELECT p FROM Products p WHERE p.productBarcode = :productBarcode"),
    @NamedQuery(name = "Products.findByProductQuantity", query = "SELECT p FROM Products p WHERE p.productQuantity = :productQuantity")})
public class Products implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_price")
    private String productPrice;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_color")
    private String productColor;
    @Column(name = "product_size")
    private String productSize;
    @Column(name = "product_brand")
    private String productBrand;
    @Column(name = "product_barcode")
    private Integer productBarcode;
    @Column(name = "product_quantity")
    private Integer productQuantity;

    public Products() {
    }

    public Products(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        Integer oldProductId = this.productId;
        this.productId = productId;
        changeSupport.firePropertyChange("productId", oldProductId, productId);
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        String oldProductPrice = this.productPrice;
        this.productPrice = productPrice;
        changeSupport.firePropertyChange("productPrice", oldProductPrice, productPrice);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        String oldProductName = this.productName;
        this.productName = productName;
        changeSupport.firePropertyChange("productName", oldProductName, productName);
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        String oldProductDescription = this.productDescription;
        this.productDescription = productDescription;
        changeSupport.firePropertyChange("productDescription", oldProductDescription, productDescription);
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        String oldProductColor = this.productColor;
        this.productColor = productColor;
        changeSupport.firePropertyChange("productColor", oldProductColor, productColor);
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        String oldProductSize = this.productSize;
        this.productSize = productSize;
        changeSupport.firePropertyChange("productSize", oldProductSize, productSize);
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        String oldProductBrand = this.productBrand;
        this.productBrand = productBrand;
        changeSupport.firePropertyChange("productBrand", oldProductBrand, productBrand);
    }

    public Integer getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(Integer productBarcode) {
        Integer oldProductBarcode = this.productBarcode;
        this.productBarcode = productBarcode;
        changeSupport.firePropertyChange("productBarcode", oldProductBarcode, productBarcode);
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        Integer oldProductQuantity = this.productQuantity;
        this.productQuantity = productQuantity;
        changeSupport.firePropertyChange("productQuantity", oldProductQuantity, productQuantity);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mdshop.Products[ productId=" + productId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
