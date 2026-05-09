import { Routes } from '@angular/router';

import { TestMasterComponent } from './components/test-master/test-master.component';
import { TestOrderComponent } from './components/test-order/test-order.component';
import { ResultEntryComponent } from './components/result-entry/result-entry.component';

export const routes: Routes = [

  {
    path: '',
    component: TestMasterComponent
  },

  {
    path: 'orders',
    component: TestOrderComponent
  },

  {
    path: 'results',
    component: ResultEntryComponent
  }
];