// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

// ************************************************************************* //
//                              avtArccosExpression.h                            //
// ************************************************************************* //

#ifndef AVT_ARCCOS_FILTER_H
#define AVT_ARCCOS_FILTER_H


#include <avtUnaryMathExpression.h>

class     vtkDataArray;


// ****************************************************************************
//  Class: avtArccosExpression
//
//  Purpose:
//      A filter that calculates the arccosine of its input.
//
//  Programmer: Sean Ahern
//  Creation:   Thu Jun 27 11:22:28 PDT 2002
//
//  Modifications:
//
//    Hank Childs, Fri Nov 15 15:23:54 PST 2002
//    Added support for vectors and non-float arrays.
//
//    Hank Childs, Thu Feb  5 17:11:06 PST 2004
//    Moved inlined constructor and destructor definitions to .C files
//    because certain compilers have problems with them.
// 
//    Justin Privitera, Mon Oct 28 10:15:57 PDT 2024
//    Pass in_ds to DoOperation().
//
// ****************************************************************************

class EXPRESSION_API avtArccosExpression : public avtUnaryMathExpression
{
  public:
                              avtArccosExpression();
    virtual                  ~avtArccosExpression();

    virtual const char       *GetType(void)   { return "avtArccosExpression"; };
    virtual const char       *GetDescription(void) 
                                           { return "Calculating arccosine"; };

  protected:
    virtual void              DoOperation(vtkDataArray *in, vtkDataArray *out,
                                          int ncomponents, int ntuples, vtkDataSet *in_ds);
};


#endif


