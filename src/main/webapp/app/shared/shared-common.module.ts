import { NgModule } from '@angular/core';

import { TaobedSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [TaobedSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [TaobedSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TaobedSharedCommonModule {}
