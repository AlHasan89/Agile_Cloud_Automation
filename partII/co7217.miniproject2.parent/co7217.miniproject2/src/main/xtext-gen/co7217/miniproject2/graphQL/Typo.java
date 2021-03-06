/**
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2.graphQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.miniproject2.graphQL.Typo#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see co7217.miniproject2.graphQL.GraphQLPackage#getTypo()
 * @model
 * @generated
 */
public interface Typo extends Type
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link co7217.miniproject2.graphQL.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see co7217.miniproject2.graphQL.GraphQLPackage#getTypo_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Typo
