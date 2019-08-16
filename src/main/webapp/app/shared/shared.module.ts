import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { TaobedSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [TaobedSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [TaobedSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class TaobedSharedModule {
  static forRoot() {
    return {
      ngModule: TaobedSharedModule
    };
  }
}
