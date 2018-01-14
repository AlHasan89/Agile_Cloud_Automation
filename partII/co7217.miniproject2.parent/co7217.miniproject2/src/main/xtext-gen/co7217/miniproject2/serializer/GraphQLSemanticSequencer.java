/*
 * generated by Xtext 2.12.0
 */
package co7217.miniproject2.serializer;

import co7217.miniproject2.graphQL.Feature;
import co7217.miniproject2.graphQL.GraphQL;
import co7217.miniproject2.graphQL.GraphQLPackage;
import co7217.miniproject2.graphQL.Query;
import co7217.miniproject2.graphQL.QueryField;
import co7217.miniproject2.graphQL.Scalar;
import co7217.miniproject2.graphQL.Typo;
import co7217.miniproject2.services.GraphQLGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GraphQLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraphQLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GraphQLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GraphQLPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case GraphQLPackage.GRAPH_QL:
				sequence_GraphQL(context, (GraphQL) semanticObject); 
				return; 
			case GraphQLPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case GraphQLPackage.QUERY_FIELD:
				sequence_QueryField(context, (QueryField) semanticObject); 
				return; 
			case GraphQLPackage.SCALAR:
				sequence_Scalar(context, (Scalar) semanticObject); 
				return; 
			case GraphQLPackage.TYPO:
				sequence_Typo(context, (Typo) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     ((name=ID type=[Type|ID]) | (name=ID type=[Type|ID]))
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphQL returns GraphQL
	 *
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_GraphQL(ISerializationContext context, GraphQL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QueryField returns QueryField
	 *
	 * Constraint:
	 *     (name=ID nestedQuery+=QueryField*)
	 */
	protected void sequence_QueryField(ISerializationContext context, QueryField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Query
	 *     Query returns Query
	 *
	 * Constraint:
	 *     (name=ID queryField+=QueryField+)
	 */
	protected void sequence_Query(ISerializationContext context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Scalar
	 *     Type returns Scalar
	 *     Scalar returns Scalar
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Scalar(ISerializationContext context, Scalar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GraphQLPackage.Literals.ABSTRACT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphQLPackage.Literals.ABSTRACT_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Typo
	 *     Type returns Typo
	 *     Typo returns Typo
	 *
	 * Constraint:
	 *     (name=ID features+=Feature+)
	 */
	protected void sequence_Typo(ISerializationContext context, Typo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}