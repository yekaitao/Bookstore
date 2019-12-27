package bookstore.mapper;

import java.util.List;

import bookstore.pojo.PropertyValue;
import bookstore.pojo.PropertyValueExample;

public interface PropertyValueMapper extends BaseMapper<PropertyValue, PropertyValueExample> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    int insert(PropertyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    int insertSelective(PropertyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    List<PropertyValue> selectByExample(PropertyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    PropertyValue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PropertyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property_value
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PropertyValue record);
}