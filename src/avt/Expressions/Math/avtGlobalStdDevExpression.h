// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

// ************************************************************************* //
//                               avtGlobalStdDevExpression.h                 //
// ************************************************************************* //

#ifndef AVT_GLOBAL_STD_DEV_FILTER_H
#define AVT_GLOBAL_STD_DEV_FILTER_H

#include <avtGhostAwareUnaryMathExpression.h>

class     vtkDataArray;


// ****************************************************************************
//  Class: avtGlobalStdDevExpression
//
//  Purpose:
//      An expression that calculates the standard deviation across the entire 
//      mesh and paints the result on every node or zone.
//
//  Programmer: Justin Privitera
//  Creation:   09/30/24
//
//  Modifications:
//
// ****************************************************************************

class EXPRESSION_API avtGlobalStdDevExpression : public avtGhostAwareUnaryMathExpression
{
  public:
                              avtGlobalStdDevExpression();
    virtual                  ~avtGlobalStdDevExpression();

    virtual const char       *GetType(void)   { return "avtGlobalStdDevExpression"; };
    virtual const char       *GetDescription(void) 
                                              { return "Calculating standard deviation across mesh"; };

  protected:
    virtual void              CalculateWithoutGhosts(vtkDataArray *in, vtkDataArray *out,
                                                     int ncomponents, int ntuples);
    virtual void              CalculateWithGhosts(vtkDataArray *in, vtkDataArray *out,
                                                  int ncomponents, int ntuples,
                                                  int (getNodeOrCellValid)(vtkDataArray *, int *, int),
                                                  vtkDataArray *ghostZones,
                                                  int *nodeShouldBeIgnoredPtr);
};


#endif


